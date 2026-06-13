package Builder;

public class Computador {
    private String processador;
    private String memoriaRAM;
    private String armazenamento;
    private String placaDeVideo;
    private String sistemaOperacional;

    public Computador(String processador, String memoriaRAM, String armazenamento, String placaDeVideo, String sistemaOperacional) {
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
        this.placaDeVideo = placaDeVideo;
        this.sistemaOperacional = sistemaOperacional;
    }
    
    public String getProcessador() {
        return processador;
    }
    public void setProcessador(String processador) {
        this.processador = processador;
    }
    public String getMemoriaRAM() {
        return memoriaRAM;
    }
    public void setMemoriaRAM(String memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }
    public String getArmazenamento() {
        return armazenamento;
    }
    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }
    public String getPlacaDeVideo() {
        return placaDeVideo;
    }
    public void setPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
    }
    public String getSistemaOperacional() {
        return sistemaOperacional;
    }
    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    @Override
    public String toString() {
        return "processador=" + processador + "\nmemoriaRAM=" + memoriaRAM + "\narmazenamento="
                + armazenamento + "\nplacaDeVideo=" + (placaDeVideo != null ? placaDeVideo : "N/A") + "\nsistemaOperacional=" + (sistemaOperacional != null ? sistemaOperacional : "N/A");
    }

    

}