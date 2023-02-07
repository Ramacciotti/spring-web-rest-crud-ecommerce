-- Table: public.payment_card

-- DROP TABLE IF EXISTS public.payment_card;

CREATE TABLE IF NOT EXISTS public.payment_card
(
    installment_number integer,
    client_order_id bigint NOT NULL,
    CONSTRAINT payment_card_pkey PRIMARY KEY (client_order_id),
    CONSTRAINT fk8edfcpxaie8rj6iqmms5ckbdx FOREIGN KEY (client_order_id)
        REFERENCES public.payment (client_order_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.payment_card
    OWNER to ramacciotti;