package com.tistory.workshop6349.object.builder.pizza;

import java.util.Objects;

public class BusanPizza extends Pizza {

    public enum Size {
        SMALL, MEDIUM, LARGE
    }
    private final Size size;

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        public BusanPizza build() {
            return new BusanPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private BusanPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }
}
