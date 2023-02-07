-- Table: public.payment

-- DROP TABLE IF EXISTS public.payment;

CREATE TABLE IF NOT EXISTS public.payment
(
    client_order_id bigint NOT NULL,
    status smallint,
    CONSTRAINT payment_pkey PRIMARY KEY (client_order_id),
    CONSTRAINT fkavenyq25l4flsd48f11os4mff FOREIGN KEY (client_order_id)
        REFERENCES public.client_order (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.payment
    OWNER to ramacciotti;