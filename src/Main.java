class Main {

    public static void main(String[] args) {

        Linkedlist ll = new Linkedlist();

        Candidato c1 = new Candidato("Sergio", "P1");
        Candidato c2 = new Candidato("Martin", "P2");
        Candidato c3 = new Candidato("Joakin", "P3");

        Votante v1 = new Votante(1, "Votante 1");
        Votante v2 = new Votante(2, "Votante 2");
        Votante v3 = new Votante(3, "Votante 3");
        Votante v4 = new Votante(4, "Votante 4");
        Votante v5 = new Votante(5, "Votante 5");

        ll.insert(c1);
        ll.insert(c2);
        ll.insert(c3);

        UrnaElectoral ue = new UrnaElectoral(ll);

        ue.obtenerResultados();

        ue.registrarVoto(v1, c1.getID());
        ue.registrarVoto(v2, c2.getID());
        ue.registrarVoto(v3, c1.getID());
        // Se asignan dos votos al candidato 1 y un voto al candidato 2.

        ue.obtenerResultados();

        // El votante 1 no puede votar pues ya votó por el candidato 1, por lo tanto la tabla de
        // resultados queda igual.
        ue.registrarVoto(v1, c3.getID());

        ue.obtenerResultados();

        // Se reporta el único voto del candidato 2 (las IDs de los votos van en orden, y el único voto del candidato 2
        // fue el segundo realizado, por lo que su ID es 2).
        ue.reportarVoto(c2, 2);

        ue.obtenerResultados();

        // Se registra un voto usando la ID numérica del candidato "Joakin", que en este caso es 3, pues al igual que
        // los votos, las ID se asignan automáticamente, y "Joakin" fue el 3er candidato en ser agregado por tanto
        // su ID es 3.
        ue.registrarVoto(v4, 3);

        ue.obtenerResultados();

        // Se registra un voto para un candidato que no existe, imprimiendo un error en la consola
        ue.registrarVoto(v5, 6);

        // Se reporta un voto cuya ID no existe, imprimiendo un error en la consola
        ue.reportarVoto(c2, 8);


    }
}
