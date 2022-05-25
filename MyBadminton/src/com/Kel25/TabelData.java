package com.Kel25;
import javax.swing.table.DefaultTableModel;

public class TabelData {

        private DefaultTableModel tabel = new DefaultTableModel();
        public TabelData(){

            getTabel().addColumn("Kode");
            getTabel().addColumn("Nama");
            getTabel().addColumn("No.HP");
            getTabel().addColumn("Tanggal");
            getTabel().addColumn("Waktu");

        }

        /**
         * @return the tabel
         */
        public DefaultTableModel getTabel() {
            return tabel;
        }

        /**
         * @param tabel the tabel to set
         */
        public void setTabel(DefaultTableModel tabel) {
            this.tabel = tabel;
        }

    }

