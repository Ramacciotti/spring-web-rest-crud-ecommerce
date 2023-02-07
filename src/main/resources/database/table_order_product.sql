-- Table: public.order_product

-- DROP TABLE IF EXISTS public.order_product;

CREATE TABLE IF NOT EXISTS public.order_product
(
    client_order_id bigint NOT NULL,
    product_id bigint NOT NULL,
    CONSTRAINT fkhnfgqyjx3i80qoymrssls3kno FOREIGN KEY (product_id)
        REFERENCES public.product (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fkq8jjmxm0o1amhmerdmw9naojn FOREIGN KEY (client_order_id)
        REFERENCES public.client_order (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.order_product
    OWNER to ramacciotti;