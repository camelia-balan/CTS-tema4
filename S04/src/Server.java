public class Server {
    int portNr;
    String name;

    private Server() {
        this.portNr=0;
        this.name = "";
    }
    private static Server instance;
    public static Server getInstance() {
        if(instance == null)
        {
            instance = new Server();
            return Server.instance;
        }
        return Server.instance;
    }
    public String showStatus() {
        return "Serverul ruleaza pe portul " + portNr;
    }

}
//Exemplu Singleton

//O fabrica de masini care implementeaza un sistem centralizat de monitorizare a productiei. Sistemul trebuie sa
//asigure adaugarea si modificarea datelor despre masinile fabricate la nivelul sediului central, intr-un mediu
//securizat (sistemul va exista sub forma unui server dispus in datacenter-ul din HQ). Programatorii trebuie sa
//se asigure ca sistemul nu va putea fi replicat si ca toate datele vor fi manageriate prin intermediul singurului server
//mentionat anterior.