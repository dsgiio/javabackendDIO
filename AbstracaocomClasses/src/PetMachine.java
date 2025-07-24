public class PetMachine {
    private boolean clean = true;

    private final static int MAX_WATER_CAPACITY = 30; // Capacidade máxima de água
    private int water = MAX_WATER_CAPACITY; // Inicializa com a capacidade máxima

    private final static int MAX_SHAMPOO_CAPACITY = 10; // Capacidade máxima de shampoo
    private int shampoo = MAX_SHAMPOO_CAPACITY; // Inicializa com a capacidade máxima

    private Pet pet;

    public void takeaShower() {
        if (this.pet == null) {
            System.out.println("Coloque o pet na máquina para iniciar o banho!");
            return;
        }
        if (this.water < 10) {
            System.out.println("Não há água suficiente para o banho. Nível atual: " + water + " litro(s). Mínimo necessário: 10.");
            return;
        }
        if (this.shampoo < 2) {
            System.out.println("Não há shampoo suficiente para o banho. Nível atual: " + shampoo + " litro(s). Mínimo necessário: 2.");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;

        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + " está limpo!");
    }

    public void addWater() {
        if (water >= MAX_WATER_CAPACITY) {
            System.out.println("A capacidade de água da máquina está no máximo.");
            return;
        }
        water = Math.min(MAX_WATER_CAPACITY, water + 2);
        System.out.println("Água adicionada. Nível atual: " + water + " litro(s).");
    }

    public void addShampoo() {
        if (shampoo >= MAX_SHAMPOO_CAPACITY) {
            System.out.println("A capacidade de shampoo da máquina está no máximo.");
            return;
        }
        shampoo = Math.min(MAX_SHAMPOO_CAPACITY, shampoo + 2);
        System.out.println("Shampoo adicionado. Nível atual: " + shampoo + " litro(s).");
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.clean) {
            System.out.println("A máquina está suja. Para colocar o pet, é necessário limpá-la.");
            return;
        }
        if (hasPet()) {
            System.out.println("O pet " + this.pet.getName() + " já está na máquina nesse momento.");
            return;
        }
        this.pet = pet;
        System.out.println("O pet " + pet.getName() + " foi colocado na máquina.");
    }

    public void removePet() {
        if (this.pet == null) {
            System.out.println("Não há pet na máquina para remover.");
            return;
        }
        this.clean = false; // A máquina fica suja após o uso
        System.out.println("O pet " + this.pet.getName() + " foi retirado da máquina.");
        this.pet = null;
    }

    public void wash() {
        // Este método limpa a máquina, não consome os recursos de banho.
        this.clean = true;
        System.out.println("A máquina foi limpa.");
    }
}