package singleton;

public class CzekoladowyKociol {

    private boolean pusty;
    private boolean ugotowany;

    private static CzekoladowyKociol unikalnaInstancja;

    private CzekoladowyKociol() {
        pusty = true;
        ugotowany = false;
    }

    public static CzekoladowyKociol pobierzInstancje(){
        if(unikalnaInstancja == null ){
            unikalnaInstancja = new CzekoladowyKociol();
        }
        return unikalnaInstancja;
    }

    public void napelnij(){
        if(!jestPusty()){
            pusty = false;
            ugotowany = false;
//          napełniamy bojler mieszanka mleka i czekolady
        }
    }

    public void oproznij(){
        if(!jestPusty() && jestUgotowany()){
//  opróżniaj bojler z ugotowaną mieszanka mleka i czekolady
            pusty = true;
        }
    }

    public void gotuj(){
        if(!jestPusty() && !jestUgotowany()){
//      gotuj zawartosc bojlera
            ugotowany = true;
        }
    }

    public boolean jestUgotowany() {
        return ugotowany;
    }

    public boolean jestPusty() {
        return pusty;
    }


}
