public class TripleTacoBox implements TacoBox {
    private int tacos;
    public TripleTacoBox(){
        this.tacos = 3;

    }
    public void eat(){
        this.tacos-=1;
        if(this.tacos<0){
            this.tacos=0;
        }
    }
    public int tacosRemaining(){
        //if(this.tacos < 0){
        //    this.tacos=0;
        //}
        return this.tacos;
    }

}
