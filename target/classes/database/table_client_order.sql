-- Table: public.client_order

-- DROP TABLE IF EXISTS public.client_order;

CREATE TABLE IF NOT EXISTS public.client_order
(
    id bigint NOT NULL DEFAULT nextval('client_order_id_seq'::regclass),
    date date,
    address_id bigint,
    client_id bigint,
    CONSTRAINT client_order_pkey PRIMARY KEY (id),
    CONSTRAINT fkcggjtc9f3otuprl7takbttwuk FOREIGN KEY (client_id)
        REFERENCES public.client (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fkignb84beb69yve5wu5g4pcvlr FOREIGN KEY (address_id)
        REFERENCES public.address (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.client_order
    OWNER to ramacciotti;