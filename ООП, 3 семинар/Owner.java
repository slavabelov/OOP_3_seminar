class Owner {
    private String name;

    public Owner(String name) {
        this.name = name;
    }

    public Owner() {
        this(null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}