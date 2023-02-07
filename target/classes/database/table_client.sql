-- Table: public.table_client

-- DROP TABLE IF EXISTS public.table_client;

CREATE TABLE IF NOT EXISTS public.table_client
(
    id bigint NOT NULL DEFAULT nextval('table_client_id_seq'::regclass),
    client_type smallint,
    cpf_or_cpnj character varying(255) COLLATE pg_catalog."default" NOT NULL,
    email character varying(255) COLLATE pg_catalog."default" NOT NULL,
    name character varying(255) COLLATE pg_catalog."default" NOT NULL,

    CONSTRAINT table_client_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.table_client
    OWNER to ramacciotti;