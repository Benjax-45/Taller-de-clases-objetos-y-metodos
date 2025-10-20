public class PerfilMedico {
    private String primerNombre;
    private String apellido;
    private String sexo;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anoNacimiento;
    private double altura;
    private double peso;

    public PerfilMedico(String primerNombre, String apellido, String sexo, int diaNacimiento, int mesNacimiento, int anoNacimiento, double altura, double peso) {
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anoNacimiento = anoNacimiento;
        this.altura = altura;
        this.peso = peso;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public int getAnoNacimiento() {
        return anoNacimiento;
    }

    public void setAnoNacimiento(int anoNacimiento) {
        this.anoNacimiento = anoNacimiento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int calcularEdad() {
        int anoActual = 2025;
        return anoActual - anoNacimiento;
    }
    public int frecuenciaCardiacaMaxima() {
        return 220 - calcularEdad();
    }

    public String rangoFrecuenciaCardiaca() {
        int maxima = frecuenciaCardiacaMaxima();
        int minimo = maxima / 2;
        int maximo = maxima * 85 / 100;
        return minimo + " - " + maximo + " latidos por minuto";
    }
    public double calcularBMI() {
        double alturaEnCm = altura / 100.0;
        return peso / (alturaEnCm * alturaEnCm);
    }
    public String obtenerCategoriaBMI() {
        double bmi = calcularBMI();
        if (bmi < 18.5) {
            return "Bajo peso";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "Normal";
        } else if (bmi >= 25 && bmi < 30) {
            return "Sobrepeso";
        } else {
            return "Obeso";
        }
    }
}
