package com.tistory.workshop6349.object.builder.pizza;

public class SeoulPizza extends Pizza {

    private final boolean sausageInside;

    public static class Builder extends Pizza.Builder<Builder> {
        private boolean sausageInside;

        public Builder addSausageInside() {
            this.sausageInside = true;
            return this;
        }

        @Override
        public SeoulPizza build() {
            return new SeoulPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private SeoulPizza(Builder builder) {
        super(builder);
        this.sausageInside = builder.sausageInside;
    }

}
