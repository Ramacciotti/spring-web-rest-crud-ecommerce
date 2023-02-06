-- Table: public.table_city

-- DROP TABLE IF EXISTS public.table_city;

CREATE TABLE IF NOT EXISTS public.table_city
(
    id bigint NOT NULL DEFAULT nextval('table_city_id_seq'::regclass),
    name character varying(255) COLLATE pg_catalog."default" NOT NULL,
    state_id bigint,
    CONSTRAINT table_city_pkey PRIMARY KEY (id),
    CONSTRAINT fkgwug902gsh72na4pvjfw0f9xi FOREIGN KEY (state_id)
        REFERENCES public.table_state (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.table_city
    OWNER to ramacciotti;