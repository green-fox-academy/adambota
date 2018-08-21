class Aircraft {
    int ammoLeft;
    int maxAmmo;
    int damage;

    int fight() {
        int damage = this.ammoLeft * this.damage;
        this.ammoLeft = 0;
        return damage;
    }

    int refill(int number) {
        if (number < (this.maxAmmo - this.ammoLeft)) {
            this.ammoLeft += number;
            return 0;
        } else {
            int remaining = number - (this.maxAmmo - this.ammoLeft);
            this.ammoLeft = this.maxAmmo;
            return remaining;
        }
    }

    private String getType() {
        if (this instanceof F16) return "F16";
        else return "F35";
    }

    String getStatus() {
        return ("Type: " + this.getType() + ", Ammo: " + this.ammoLeft + ", Base Damage: " + this.damage + ", All damage: " + this.ammoLeft * this.damage);
    }

    boolean isPriority() {
        return this instanceof F35;
    }
}
