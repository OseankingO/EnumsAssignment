package com.itlize.EnumsPractice;

public enum DuongXinyuEnum {
    Duong {
        public String getCatchPhrase() {
            return "Hey, my name is Duong!";
        }

        public boolean isDuong() {
            return true;
        }

        public boolean isXinyu() {
            return false;
        }
    },
    Xinyu {
        public String getCatchPhrase() {
            return "Hey, my name is Xinyu!";
        }

        public boolean isDuong() {
            return false;
        }

        public boolean isXinyu() {
            return true;
        }
    };

    public abstract String getCatchPhrase();

    public abstract boolean isDuong();

    public abstract boolean isXinyu();


}
