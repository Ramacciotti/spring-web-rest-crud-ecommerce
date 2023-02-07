-- Table: public.phone

-- DROP TABLE IF EXISTS public.phone;

CREATE TABLE IF NOT EXISTS public.phone
(
    client_id bigint NOT NULL,
    phones character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT fk3o48ec26lujl3kf01hwqplhn2 FOREIGN KEY (client_id)
        REFERENCES public.client (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.phone
    OWNER to ramacciotti;