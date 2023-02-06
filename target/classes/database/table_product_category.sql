-- Table: public.table_product_category

-- DROP TABLE IF EXISTS public.table_product_category;

CREATE TABLE IF NOT EXISTS public.table_product_category
(
    product_id bigint NOT NULL,
    category_id bigint NOT NULL,
    CONSTRAINT fk73lqrndla4r526pk8y5x1m8q FOREIGN KEY (category_id)
        REFERENCES public.table_category (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fkjlrt9w57o7s1henb2yt598mxw FOREIGN KEY (product_id)
        REFERENCES public.table_product (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.table_product_category
    OWNER to ramacciotti;