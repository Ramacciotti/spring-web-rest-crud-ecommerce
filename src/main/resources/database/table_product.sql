-- Table: public.table_product

-- DROP TABLE IF EXISTS public.table_product;

CREATE TABLE IF NOT EXISTS public.table_product
(
    id bigint NOT NULL DEFAULT nextval('table_product_id_seq'::regclass),
    name character varying(20) COLLATE pg_catalog."default" NOT NULL,
    price numeric(38,2),
    CONSTRAINT table_product_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.table_product
    OWNER to ramacciotti;