package ac1_pokemon_top;

public class Pokemon {
    
    private String nome;
    private String tipo;
    private int level;
    private int vida = 150;
    private int ataque = 80;
    private int defesa = 80;    

    public Pokemon(String nome, String tipo, int level){
        this.nome = nome;
        this.tipo = tipo;
        this.level = level;
                
        calculaAtributos();
        calculaBonus();
    }

    public String getNome(){
      return this.nome;
    }

    public int getVida(){
        return this.vida;
    }
    
    public int getAtaque(){
        return this.ataque;
    }
    
    public int getDefesa(){
        return this.defesa;
    }

    private void calculaAtributos(){
        switch(tipo){
            case "Fogo":
                vida = vida - 20;
                ataque = ataque + 20;
                defesa = defesa - 20;
            break;
            
            case "Agua":
                vida = vida + 10;
                ataque = ataque - 5;
                defesa = defesa + 20;
            break;
            
            case "Planta":
                vida = vida + 25;
                ataque = ataque -15;
                defesa = defesa + 20;
            break;
            
            case "Pedra":
                vida = vida + 30;
                ataque = ataque + 5;
                defesa = defesa + 20;
            break;
        }
    }
    
    private void calculaBonus(){
        
        vida = vida + (level + 20);
        ataque = ataque + (level + 10);
        defesa = defesa + (level + 10);
        
    }   
       
    public void imprimiPokemon(){
        
        System.out.println(
                "Nome: " + nome + " | " + 
                    "Tipo: " + tipo + " | " + 
                        "Level: " + level + " | " + 
                            "Vida: " + vida + " | " +
                                "Ataque: " + ataque + " | " +
                                    "Defesa: " + defesa + "\n");
        
    }   
    
}