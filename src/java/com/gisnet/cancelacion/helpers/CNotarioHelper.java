/*
 * Copyright (C) 2015 GISNET
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.gisnet.cancelacion.helpers;

import com.gisnet.cancelacion.pojos.CNotario;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author leonel
 */
public class CNotarioHelper {

    public CNotarioHelper() {

    }

    public List<CNotario> queryConsultarListaDeNotarios(int numeroDeCredito, String entidad) {

        List<CNotario> cn = new ArrayList<CNotario>();

        /*try {
         org.hibernate.Transaction tx = session.beginTransaction();
         Query q = session.createQuery("from CNotario as cn where cn.notarioId=" + numeroDeCredito);
         cn = (List<CNotario>) q.list();
         } catch (Exception e) {
         e.printStackTrace();
         }*/
        //CCaso caso = new CCaso();
        CEntidadHelper e = new CEntidadHelper();

        if (entidad.equals("") || numeroDeCredito > 0) {
            /*caso.setCasoId((long) Math.random());
             caso.setNumeroDeCaso((int) Math.random());
             caso.setNumeroDeCredito(numeroDeCredito);*/
            CNotario n1 = new CNotario();
            n1.setCodigoNotario(234 + (int) Math.random());
            n1.setNombreNotario("Teodoro Ortíz");
            n1.setNotariaNumero("Notaria 100");
            n1.setCEntidad(entidad);
            n1.setConvenioInfonavit(1);
            n1.setEmail("tortiz@notaria100.com");
            n1.setTelefono("7687699876");
            n1.setCodigoRespuesta("LN00");

            cn.add(n1);
            
            
            
        } else {
            if (numeroDeCredito <= 0 && entidad.equals("")) {
                CNotario n1 = new CNotario();
                n1.setCodigoRespuesta("LN03");
                cn.add(n1);
            } else {

                CNotario n1 = new CNotario();
                n1.setCodigoNotario(234 + (int) Math.random());
                n1.setNombreNotario("Daniel Mejía");
                n1.setNotariaNumero("Notaria 65");
                n1.setCEntidad(entidad);
                n1.setConvenioInfonavit(1);
                n1.setEmail("dmejia@notaria65.com");
                n1.setTelefono("7687699876");
                n1.setCodigoRespuesta("LN00");

                CNotario n2 = new CNotario();
                n2.setCodigoNotario(464 + (int) Math.random());
                n2.setNombreNotario("Damian Tapía");
                n2.setNotariaNumero("Notaria 23");
                n2.setCEntidad(entidad);
                n2.setConvenioInfonavit(1);
                n2.setEmail("dmejia@notaria23.com");
                n2.setTelefono("4444843576");

                cn.add(n1);
                cn.add(n2);
            }
        }

        // Hace la búsqueda en la BD
        return cn;
    }

    public List<CNotario> queryConsultarListaDeNotariosAdai(String entidad) {

        List<CNotario> cn = new ArrayList<CNotario>();

        /*try {
         org.hibernate.Transaction tx = session.beginTransaction();
         Query q = session.createQuery("from CNotario as cn where cn.notarioId=" + entidad);
         cn = (List<CNotario>) q.list();
         } catch (Exception e) {
         e.printStackTrace();
         }*/
        if (entidad.equals("")) {

            CNotario n1 = new CNotario();
            n1.setCodigoRespuesta("Ingresar una entidad");
            cn.add(n1);
        } else {

            CNotario n1 = new CNotario();
            n1.setCodigoNotario(134 + (int) Math.random());
            n1.setNombreNotario("Teodoro Ortíz");
            n1.setNotariaNumero("Notaria 100");
            n1.setCEntidad(entidad);
            n1.setConvenioInfonavit(1);
            n1.setEmail("tortiz@notaria100.com");
            n1.setTelefono("7687699876");
            n1.setCodigoRespuesta("LN00");

            cn.add(n1);

            CNotario n2 = new CNotario();
            n2.setCodigoNotario(864);
            n2.setNombreNotario("Daniel Mejía");
            n2.setNotariaNumero("Notaria 65");
            n2.setCEntidad(entidad);
            n2.setConvenioInfonavit(1);
            n2.setEmail("dmejia@notaria65.com");
            n2.setTelefono("7687699876");
            n2.setCodigoRespuesta("LN00");

            cn.add(n2);

            CNotario n3 = new CNotario();
            n3.setCodigoNotario(434);
            n3.setNombreNotario("Damian Tapía");
            n3.setNotariaNumero("Notaria 23");
            n3.setCEntidad(entidad);
            n3.setConvenioInfonavit(1);
            n3.setEmail("dmejia@notaria23.com");
            n3.setTelefono("4444843576");

            cn.add(n3);
        }

        // Hace la búsqueda en la BD
        return cn;
    }
}
