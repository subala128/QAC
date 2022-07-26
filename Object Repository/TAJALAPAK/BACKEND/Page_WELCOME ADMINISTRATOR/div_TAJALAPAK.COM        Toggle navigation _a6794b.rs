<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_TAJALAPAK.COM        Toggle navigation _a6794b</name>
   <tag></tag>
   <elementGuidId>7061c756-5f5f-4bbf-9a97-65da773c9905</elementGuidId>
   <selectorCollection>
      <entry>
         <key>CSS</key>
         <value>div.wrapper</value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>//div[2]</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>wrapper</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
      
          

  
  
  
  TAJALAPAK.COM



  
  
    Toggle navigation
  
  
    
      
      25
                41      
        
      

    
  
      

      
                  
          
          
            
                        
            
            
              Robby Prihandaya               Online
            
          

          
          
            MENU admin
             Dashboard
            
               Menu Utama
              
               Identitas Website Logo Website Template Website Background Website Menu Website Halaman Baru Data Donasi E-mail Subscribe              
            

            
               Master Market
              
                 Konsumen Reseller / Pelapak Sopir / Kurir Internal Paket Reseller Supplier Kategori Produk Sub-Kategori Produk Merek Produk Produk Rekening Perusahaan Image Slider Margin PPOB Ongkir Kurir Internal Kurir Rajaongkir              
            

            
               Transaksi Market
              
                 Flash Deal / Penawaran Perusahaan ke Supplier Penjualan ke Reseller Pembayaran Reseller Penjualan ke Konsumen Komplain Orders Konf. Order Konsumen Data Mutasi Bank Trans. Withdraw Trans. Paket Reseller              
            

            
               Report Market
              
                 Rekap Transaksi Reseller Testimoni Konsumen              
            

            
               Modul Berita
              
               Berita Kategori Berita Tag Berita              
            

            
               Modul Iklan
              
               Iklan Popup Iklan Home Iklan Sidebar Iklan Link              
            

            
               Modul Users
              
               Manajemen User Manajemen Modul              
            
            
             Edit Profile
             Logout
          
              

      
        
           Dashboard Control panel  
        

        
            
              
                
                  Edit Rute dan Ongkir Driver
                
              

                  
                  
                    
                    Kendaraan    
                      - Pilih -Roda 2Roda 4
                    Posisi      
                    
                      - Pilih Provinsi -BaliBangka BelitungBantenBengkuluDI YogyakartaDKI JakartaGorontaloJambiJawa BaratJawa TengahJawa TimurKalimantan BaratKalimantan SelatanKalimantan TengahKalimantan TimurKalimantan UtaraKepulauan RiauLampungMalukuMaluku UtaraNanggroe Aceh Darussalam (NAD)Nusa Tenggara Barat (NTB)Nusa Tenggara Timur (NTT)PapuaPapua BaratRiauSulawesi BaratSulawesi SelatanSulawesi TengahSulawesi TenggaraSulawesi UtaraSumatera BaratSumatera SelatanSumatera Utara

                      Kota / KabupatenKabupaten BadungKabupaten BangliKabupaten BulelengKota DenpasarKabupaten GianyarKabupaten JembranaKabupaten KarangasemKabupaten KlungkungKabupaten Tabanan

                      KecamatanAbiansemalKutaKuta SelatanKuta UtaraMengwiPetang
                    
                    
                    Tujuan      
                      - Pilih Provinsi -BaliBangka BelitungBantenBengkuluDI YogyakartaDKI JakartaGorontaloJambiJawa BaratJawa TengahJawa TimurKalimantan BaratKalimantan SelatanKalimantan TengahKalimantan TimurKalimantan UtaraKepulauan RiauLampungMalukuMaluku UtaraNanggroe Aceh Darussalam (NAD)Nusa Tenggara Barat (NTB)Nusa Tenggara Timur (NTT)PapuaPapua BaratRiauSulawesi BaratSulawesi SelatanSulawesi TengahSulawesi TenggaraSulawesi UtaraSumatera BaratSumatera SelatanSumatera Utara

                      Kota / KabupatenKabupaten BangkaKabupaten Bangka BaratKabupaten Bangka SelatanKabupaten Bangka TengahKabupaten BelitungKabupaten Belitung TimurKota Pangkal Pinang

                      KecamatanBakamBelinyuMendo BaratMerawangPemaliPuding BesarRiau SilipSungai Liat
                    
                    Ongkir (Rp)    
                    Keterangan    Masih 1provinsi
                  
                  
                
              
              
                    Tambahkan
                    Cancel
                    
                  
            
$(document).ready(function(){
//* select Provinsi */
var base_url    = &quot;http://202.159.35.218:9090/ecommerce/&quot;;
$(&quot;#list_provinsi&quot;).change(function(){
    var id_province = this.value;
    kota(id_province);
    $(&quot;#div_kota&quot;).show();
});

/* select Kota */
kota = function(id_province){
    $.ajax({
    type: 'post',
    url: base_url + 'produk/rajaongkir_get_kota',
    data: {id_province:id_province},
    dataType  : 'html',
    success: function (data) {
        $(&quot;#list_kotakab&quot;).html(data);
    },
    beforeSend: function () {
        
    },
    complete: function () {
      
    }
});
}

$(&quot;#list_kotakab&quot;).change(function(){
    var id_kota = this.value;
    kecamatan(id_kota);
    $(&quot;#div_kecamatan&quot;).show();
});

kecamatan = function(id_kota){
    $.ajax({
    type: 'post',
    url: base_url + 'produk/rajaongkir_get_kecamatan',
    data: {id_kota:id_kota},
    dataType  : 'html',
    success: function (data) {
        $(&quot;#list_kecamatan&quot;).html(data);
    }
});
}
});


$(document).ready(function(){
//* select Provinsi */
var base_url    = &quot;http://202.159.35.218:9090/ecommerce/&quot;;
$(&quot;#list_provinsit&quot;).change(function(){
    var id_province = this.value;
    kotat(id_province);
    $(&quot;#div_kotat&quot;).show();
});

/* select Kota */
kotat = function(id_province){
    $.ajax({
    type: 'post',
    url: base_url + 'produk/rajaongkir_get_kota',
    data: {id_province:id_province},
    dataType  : 'html',
    success: function (data) {
        $(&quot;#list_kotakabt&quot;).html(data);
    },
    beforeSend: function () {
        
    },
    complete: function () {
      
    }
});
}

$(&quot;#list_kotakabt&quot;).change(function(){
    var id_kota = this.value;
    kecamatant(id_kota);
    $(&quot;#div_kecamatant&quot;).show();
});

kecamatant = function(id_kota){
    $.ajax({
    type: 'post',
    url: base_url + 'produk/rajaongkir_get_kecamatan',
    data: {id_kota:id_kota},
    dataType  : 'html',
    success: function (data) {
        $(&quot;#list_kecamatant&quot;).html(data);
    }
});
}
});

        
        
      
      
          
Copyright © 2016 - 2022  Marketplace PRO. All rights reserved.       

      
      
          
              
                  ×Close
                  Detail Data Donasi
              
              
                
              
          
      
      

    </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[1]/body[@class=&quot;skin-black-light sidebar-mini          pace-done&quot;]/div[@class=&quot;wrapper&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[2]</value>
   </webElementXpaths>
</WebElementEntity>
