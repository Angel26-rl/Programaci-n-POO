package staticKeyword;

public class UsoStatic {

    public static void ejecutar() {

        System.out.println("\n=== STATIC KEYWORD ===");

        Persona p1 = new Persona("Angel");
        Persona p2 = new Persona("Luis");
        Persona p3 = new Persona("Maria");

        System.out.println();
        System.out.println("Total de personas creadas: "
                + Persona.getCantidadPersonas());
    }
}