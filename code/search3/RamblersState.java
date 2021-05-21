import java.util.*;


public class RamblersSearch extends SearchState {
    // coordinate for thr state
    private String coord;

    //constructors
    puplic RamblersSearch(String cname, int lc) {
        coord = cname;
        localCost = lc;
    }
}


public String getCoord() {
    // accessor
    return coord;
}


public boolean goalPredicate(Search searcher) {
      // goalPredicate
    RamblersSearch rsearcher = (RamblersSearch) searcher;
    String tar = rsearcher.getGoal(); // get target coordinate
    return (coord.compareTo(tar) == 0);
  }



public ArrayList<RamblersState> getSuccessors(Search searcher) {
      // getSuccessors
    RamblersSearch rsearcher = (RamblersSearch) searcher;
    Coords Map = rsearcher.getMap();
    ArrayList<`TerrainMap> links = map.getLinks(city);
    ArrayList<RamblersState> succs = new ArrayList<RamblersState>();

    for (MapLink l : links) {
      String Coord1;
      if (.compareTo(l.getWidth()) == 0) {
        Coord1 = l.getDepth();
      } else {
        Coord1 = l.getWidth();
      }
      ;
      succs.add((RamblersState) new RamblersState(Coord1, l.getCost()));
    }
    return succs;
}


 public boolean sameState(SearchState s2) {
       // sameState
    RamblersState rs2 = (MapState) s2;
    return (coord.compareTo(rs2.getCoord()) == 0);
  }

 
  public String toString() {
       // toString
    return ("Ramblers State: " + coord
  }

}
