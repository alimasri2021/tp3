package question3;

import question1.PilePleineException;
import question1.PileVideException;

import java.util.Stack;

public class Pile2<T> implements PileI<T>{
    /** par délégation : utilisation de la class Stack */
    private Stack<T> stk;
    /** la capacité de la pile */
    private int capacity;

    /** Création d'une pile.
     * @param taille la "taille maximale" de la pile, doit être > 0
     */
    public Pile2(int taille){
        // à compléter
        if (taille <= 0){
            taille = CAPACITE_PAR_DEFAUT;
        }
        this.stk = new Stack<T>();
        this.capacity = taille;
    }

    public Pile2(){
        // à compléter
         this(PileI.CAPACITE_PAR_DEFAUT);
    }

    public void empiler(T o) throws PilePleineException{
        // à compléter
        if(estPleine()){
            throw new PilePleineException();
        }
        this.stk.push(o);
    }

    public T depiler() throws PileVideException{
        // à compléter
        if (estVide())
            throw new PileVideException();
        return this.stk.pop();
    }

    public T sommet() throws PileVideException{
        // à compléter
        
        if (estVide())
            throw new PileVideException();
        return this.stk.peek();
    }

    // recopier ici toutes les autres méthodes
    // qui ne sont pas modifiées en fonction
    // du type des éléments de la pile
    
        
        public int capacity(){
         return this.capacity;
    }
    
      public int taille(){
         return this.stk.size();
    }    
    public boolean estVide(){
        return this.stk.empty();
    }
    
    public boolean estPleine(){
        return this.stk.size() == this.capacity;
    }

} // Pile2