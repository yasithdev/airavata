-- Drop legacy user tables that have no JPA entity mapping.
-- USER_PROFILE (iam-service) is the canonical user table.
-- SHARING_USER (sharing-service) handles per-domain identity.

-- Drop FK from PROJECT_USER to USERS if it exists
SET @fk_exists = (SELECT COUNT(*) FROM information_schema.TABLE_CONSTRAINTS
                  WHERE CONSTRAINT_NAME = 'FK_PROJECT_USER_USER'
                  AND TABLE_NAME = 'PROJECT_USER'
                  AND TABLE_SCHEMA = DATABASE());
SET @stmt = IF(@fk_exists > 0,
    'ALTER TABLE PROJECT_USER DROP FOREIGN KEY FK_PROJECT_USER_USER',
    'SELECT 1');
PREPARE s FROM @stmt;
EXECUTE s;
DEALLOCATE PREPARE s;

DROP TABLE IF EXISTS GATEWAY_WORKER;
DROP TABLE IF EXISTS USERS;
