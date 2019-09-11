package com.xsis.FilteringTest1.Soal5;
public class Operasi{
    public class operasi {
        public float J1,J2,J3,hasilakhir,jarak,AB,BC,CD;

        public float J1()
        {
            this.jarak =AB/9;
            return jarak;
        }
        public float J2()
        {
            this.jarak =BC/9;
            return jarak;
        }
        public float J3()
        {
            this.jarak =CD/9;
            return jarak;
        }
        public void jumlah1()
        {
            this.hasilakhir= (float)(J1()+J2()+J3());
            System.out.println("Maka banyaknya bensin yang diperlukan untuk Tempat 1: "+ Math.ceil(this.hasilakhir));
        }
        public void jumlah2()
        {
            this.hasilakhir= (float)(J3());
            System.out.println("Maka banyaknya bensin yang diperlukan untuk BF: "+ this.hasilakhir);
        }
        public void jumlah3()
        {
            this.hasilakhir= (float)(J1()+J2()+J3 );
            System.out.println("Maka banyaknya bensin yang diperlukan untuk A ke F, kemudian kembali lagi ke kota B: "+ this.hasilakhir);
        }

        public void jumlah4()
        {
            this.hasilakhir= (float)(J1()+J2()+J3() );
            System.out.println("Maka banyaknya bensin yang diperlukan untuk dari kota A ke F – E – D – C – D – E – D – E – F: "+ this.hasilakhir);
        }
    }
}
