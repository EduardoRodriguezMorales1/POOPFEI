/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro1f;

/**
 *
 * @author eduar
 */
   public  class RegistroAcademico {
        private String asignatura;
        private int semestre;
        private int creditos;
        private int calificacion;
        
        /**
         * Constrcutor vacio 
         */
        public RegistroAcademico() {
            
        }

        /**
         * Constrcutor lleno
         * @param asignatura la asignatura que lleva el alumno
         * @param semestre semestre en el que va el alumno
         * @param creditos creditos de la asignatura
         * @param calificacion calificacion de la asignatura 
         */
        public RegistroAcademico(String asignatura, int semestre, int creditos, int calificacion) {
            this.asignatura = asignatura;
            this.semestre = semestre;
            this.creditos = creditos;
            this.calificacion = calificacion;
        }

        /**
         * Metodo get para la asignatura
         * @return
         */
        public String getAsignatura() {
            return asignatura;
        }

        /**
         * Metodo get para el semestre 
         * @return
         */
        public int getSemestre() {
            return semestre;
        }

        /**
         * Metodo get para los creditos 
         * @return
         */
        public int getCreditos() {
            return creditos;
        }

        /**
         * Metodo get para la calificacion 
         * @return
         */
        public int getCalificacion() {
            return calificacion;
        }

        /**
         * Metodo toString 
         */
        @Override
        public String toString() {
            return String.format("%s\t%d\t%d\t%d", asignatura, semestre, creditos, calificacion);
        }
    }
