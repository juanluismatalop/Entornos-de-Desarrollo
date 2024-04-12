package Practica4_1;

/**
 * @author Juan Luis Mata López
 * @version 1.0
 */
public class Empleado {
	private int emp_no;
	private String nombre;
	private String apellido;
	private String pobla;
	private String oficio;
	private Double salario;
	private String dept;

	/**
	 *
	 * @param emp_no
	 * @param nombre
	 * @param apellido
	 * @param pobla
	 * @param oficio
	 * @param salario
	 * @param dept
	 */
	public Empleado(int emp_no, String nombre, String apellido, String pobla, String oficio,
			Double salario, String dept) {
		this.emp_no = emp_no;
		this.nombre = nombre;
		this.apellido = apellido;
		this.pobla = pobla;
		this.oficio = oficio;
		this.salario = salario;
		this.dept = dept;
	}

	/**
	 *
	 * @param emp_no
	 * @param nombre
	 * @param salario
	 * @param dept
	 */
	
	public Empleado(int emp_no, String nombre, Double salario, String dept) {
		this.emp_no = emp_no;
		this.nombre = nombre;
		this.salario = salario;
		this.dept = dept;
	}

	public int getEmp_no() {
		return emp_no;
	}

	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPobla() {
		return pobla;
	}

	public void setPobla(String pobla) {
		this.pobla = pobla;
	}

	public String getOficio() {
		return oficio;
	}

	public void setOficio(String oficio) {
		this.oficio = oficio;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void subidasalario(Double subida) {
		salario = salario + subida;
	}
	
	private boolean comprobar(){
		if (nombre.equals("")){
			
			return false;
		}
		return true;
	}
}