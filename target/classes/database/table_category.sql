-- Table: public.table_category

-- DROP TABLE IF EXISTS public.table_category;

CREATE TABLE IF NOT EXISTS public.table_category
(
    id bigint NOT NULL DEFAULT nextval('table_category_id_seq'::regclass),
    name character varying(20) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT table_category_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.table_category
    OWNER to ramacciotti;