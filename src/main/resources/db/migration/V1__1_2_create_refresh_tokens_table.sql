CREATE TABLE refresh_tokens (
    id UUID PRIMARY KEY,
    user_id UUID NOT NULL REFERENCES users(id),
    jti UUID NOT NULL UNIQUE,
    expires_at TIMESTAMPTZ NOT NULL,
    revoked BOOLEAN NOT NULL DEFAULT FALSE,
    created_at TIMESTAMPTZ NOT NULL DEFAULT NOW()
);

CREATE INDEX idx_refresh_tokens_user_valid ON refresh_tokens(user_id, revoked, expires_at);

CREATE INDEX idx_refresh_tokens_exp_not_revoked ON refresh_tokens(expires_at) WHERE revoked = FALSE;