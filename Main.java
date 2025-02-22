public class Main {
        public static void main(String[] args){
        player p1 = new player(5, 5);
        player p2 = new player(1, 1);
        player p3 = new player(2, 2);
        player p4 = new player(3, 3);
        map carte = new map ( 6, 6 );
        carte.add_player(p1);
        carte.add_player(p2);
        carte.add_player(p3);
        carte.add_player(p4);
        String   x= carte.ceate_map();
        System.out.println(x);
        }
}