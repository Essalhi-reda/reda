import java.util.ArrayList;
import java.util.List;
public class map {
    private final int  lenght ;
    private final int  widght ;
    List<player> players= new ArrayList<>();

    //constructor de la map
    map(int lenght , int widght){
        this.lenght=lenght;
        this.widght=widght;
    }


    public  String ceate_map(){
        StringBuilder map  = new StringBuilder();
        for ( int i=1; i < lenght  ; i++){
            for ( int j= 1 ; j<widght ; j++){
                if (is_player(i,j)==false){
                map.append( "|__|");
                }else{
                   map.append("|A|"); 
                }
            }
            map.append("\n");
        }
        return map.toString();
    }



    public void add_player(player p ){
        players.add(new player(p.x,p.y));
    }



    private boolean is_player(int  x,int y ) {
        boolean var = false;
        for (player playerr: players){
            if (playerr.x==x && playerr.y==y){
                var = true;
            }
        }
        return var;
    }
}





