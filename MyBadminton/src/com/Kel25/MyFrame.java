package com.Kel25;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    private JLabel lblKode;
    private JComboBox cbKode;
    private JTextField tfNama;
    private JTextField tfNo;
    private JPanel myPanel;
    private JLabel lblNama;
    private JLabel lblNo;
    private JLabel lblTgl;
    private JLabel lblWaktu;
    private JLabel lblJudul;
    private JButton btnPesan;
    private JButton btnHapus;
    private JTable tblDataPesan;
    private JScrollPane spDataPesan;
    private JComboBox cbBulan;
    private JComboBox cbTahun;
    private JComboBox cbHari;
    private JComboBox cbMulai;
    private JComboBox cbSelesai;

    TabelData dataPesan = new TabelData();

    public MyFrame(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(myPanel);
        this.pack();

        createUIComponents();
        tblDataPesan.setModel(dataPesan.getTabel());

        for (int a=1; a<=6; a++){
            cbKode.addItem("LPMINTON"+ a);
        }

        cbHari.addItem("Tanggal");
        for (int a=1; a<=31; a++){
            cbHari.addItem(a);
        }

        cbBulan.addItem("Bulan");
        cbBulan.addItem("Januari");
        cbBulan.addItem("Februari");
        cbBulan.addItem("Maret");
        cbBulan.addItem("April");
        cbBulan.addItem("Mei");
        cbBulan.addItem("Juni");
        cbBulan.addItem("Juli");
        cbBulan.addItem("Agustus");
        cbBulan.addItem("September");
        cbBulan.addItem("Oktober");
        cbBulan.addItem("November");
        cbBulan.addItem("Desember");

        cbTahun.addItem("Tahun");
        for (int b=2020; b<=2030; b++){
            cbTahun.addItem(b);
        }

        cbMulai.addItem("Mulai");
        cbMulai.addItem("08.00");
        cbMulai.addItem("09.00");
        cbMulai.addItem("10.00");
        cbMulai.addItem("11.00");
        cbMulai.addItem("12.00");
        cbMulai.addItem("13.00");
        cbMulai.addItem("14.00");
        cbMulai.addItem("15.00");
        cbMulai.addItem("16.00");
        cbMulai.addItem("17.00");
        cbMulai.addItem("18.00");
        cbMulai.addItem("19.00");
        cbMulai.addItem("20.00");
        cbMulai.addItem("21.00");
        cbMulai.addItem("22.00");
        cbMulai.addItem("23.00");
        cbMulai.addItem("24.00");

        cbSelesai.addItem("Selesai");
        cbSelesai.addItem("08.00");
        cbSelesai.addItem("09.00");
        cbSelesai.addItem("10.00");
        cbSelesai.addItem("11.00");
        cbSelesai.addItem("12.00");
        cbSelesai.addItem("13.00");
        cbSelesai.addItem("14.00");
        cbSelesai.addItem("15.00");
        cbSelesai.addItem("16.00");
        cbSelesai.addItem("17.00");
        cbSelesai.addItem("18.00");
        cbSelesai.addItem("19.00");
        cbSelesai.addItem("20.00");
        cbSelesai.addItem("21.00");
        cbSelesai.addItem("22.00");
        cbSelesai.addItem("23.00");
        cbSelesai.addItem("24.00");


    }

    private void createUIComponents() {
        // TODO: place custom component creation code here

        tblDataPesan = new JTable();
        tblDataPesan.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        spDataPesan.setViewportView(tblDataPesan);

        btnPesan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] data = new String[5];
                data[0] = (""+cbKode.getSelectedItem());
                data[1] = tfNama.getText();
                data[2] = tfNo.getText();
                data[3] = (""+ cbHari.getSelectedItem()+" "+ cbBulan.getSelectedItem()+" "+ cbTahun.getSelectedItem());
                data[4] = (""+ cbMulai.getSelectedItem()+" - "+ cbSelesai.getSelectedItem());


                dataPesan.getTabel().addRow(data);

            }
        });
        btnHapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dataPesan.getTabel().removeRow(tblDataPesan.getSelectedRow());
            }
        });


    }
}
