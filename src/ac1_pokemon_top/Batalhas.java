package ac1_pokemon_top;

public class Batalhas {
    
    private int meuPokemonataque;
    private int outroPokemondefesa;
    private String NomemeuPokemon;
    private String outroPokemonNome;
    
    public void meuPokemon(String nome, int ataque){        
        this.meuPokemonataque = ataque;
        this.NomemeuPokemon = nome;  
        
    }
    
    public void outroPokemon(String nome,int defesa){        
        this.outroPokemonNome = nome;
        this.outroPokemondefesa = defesa;
        
    }
    
    public void startBattle(){
        
        System.out.println("A batalha vai começar!...");
        System.out.println("\n");
            
        if(meuPokemonataque > outroPokemondefesa){
            
            System.out.println("Você venceu! Parabéns " + NomemeuPokemon);
            
        }else{
            
            System.out.println("Você perdeu! Vencedor: " + outroPokemonNome);
            
        }
      }  
    }

    


    

