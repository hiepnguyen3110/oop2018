package week2.task3;

public class Task3 {
}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
class meo{
    private String mau;
    private float canNang;
    private int tuoi;
    
    public String getMau(){
        return this.mau;
    }
    public void setmau(String mau){
        this.mau = mau;
    }
    public String getCannang(){
       return this.canNang;
    }
    public void setCannang(float can){
        this.canNang = can;
    }
    public String getTuoi(){
       return this.tuoi;
    }
    public void setTuoi(int tuoi){
        this.tuoi = tuoi;
    }
}

class nguoi{
    private String quoctich;
    private int chieucao;
    private int tuoi;
    
    public String getQuoctich(){
        return this.quoctich;
    }
    public void setQuoctich(String quoctich){
        this.quoctich = quoctich;
    }
    public String getchieucao(){
       return this.chieucao;
    }
    public void setchieucao(int chieucao){
        this.chieucao = chieucao;
    }
    public String getTuoi(){
       return this.tuoi;
    }
    public void setTuoi(int tuoi){
        this.tuoi = tuoi;
    }
}
