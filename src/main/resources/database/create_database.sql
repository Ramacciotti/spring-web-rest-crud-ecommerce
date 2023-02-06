CREATE DATABASE database_ecommerce
    WITH
    OWNER = ramacciotti
    ENCODING = 'UTF8'
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;

GRANT ALL ON DATABASE database_ecommerce TO ramacciotti;