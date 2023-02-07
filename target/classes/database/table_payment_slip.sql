-- Table: public.payment_slip

-- DROP TABLE IF EXISTS public.payment_slip;

CREATE TABLE IF NOT EXISTS public.payment_slip
(
    due_date date,
    payment_date date,
    client_order_id bigint NOT NULL,
    CONSTRAINT payment_slip_pkey PRIMARY KEY (client_order_id),
    CONSTRAINT fk1u8b612txlj38fps15hjqpn5u FOREIGN KEY (client_order_id)
        REFERENCES public.payment (client_order_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.payment_slip
    OWNER to ramacciotti;