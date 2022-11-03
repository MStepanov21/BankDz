package Data;

class Collague {
    private void info(){
        naming();
        yo();
    }

    private void naming() {
        String name = "Jack";
        System.out.println(name);
    }

    private void yo() {
        int age = 21;
        System.out.println(age);

    }

    public void getInfo(){
        this.info();
    }
}
