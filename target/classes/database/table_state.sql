-- Table: public.table_state

-- DROP TABLE IF EXISTS public.table_state;

CREATE TABLE IF NOT EXISTS public.table_state
(
    id bigint NOT NULL DEFAULT nextval('table_state_id_seq'::regclass),
    name character varying(255) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT table_state_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.table_state
    OWNER to ramacciotti;