-- Table: public.table_address

-- DROP TABLE IF EXISTS public.table_address;

CREATE TABLE IF NOT EXISTS public.table_address
(
    id bigint NOT NULL DEFAULT nextval('table_address_id_seq'::regclass),
    cep character varying(255) COLLATE pg_catalog."default" NOT NULL,
    complement character varying(255) COLLATE pg_catalog."default" NOT NULL,
    neighborhood character varying(255) COLLATE pg_catalog."default" NOT NULL,
    "number" character varying(255) COLLATE pg_catalog."default" NOT NULL,
    public_area character varying(255) COLLATE pg_catalog."default" NOT NULL,
    city_id bigint,
    address_id bigint,

    CONSTRAINT table_address_pkey PRIMARY KEY (id),

    CONSTRAINT fkbt8kylou3bjwht8a78lbc6nyj FOREIGN KEY (city_id)
        REFERENCES public.table_city (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,

    CONSTRAINT fkookhyikmtwr46668bw6mq0nst FOREIGN KEY (address_id)
        REFERENCES public.table_client (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION

)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.table_address
    OWNER to ramacciotti;