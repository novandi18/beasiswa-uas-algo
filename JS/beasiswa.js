let data = [];

function Beasiswa() {
    console.clear();

    let namaInp = prompt("Masukkan nama");
    let nama = namaInp.replace(/\d+/g,'');
    
    let umurInp = prompt("Masukkan umur");
    let umur = parseInt(umurInp);

    let gajiInp = prompt("Masukkan Gaji Ortu");
    let gaji = gajiInp.replace(/\D/g,'');
    
    let ipkInp = prompt("Masukkan IPK");
    let ipk = parseFloat(ipkInp);

    if(ipk > 3 && gaji < 2000000) {
        status = "Penerima";
    } else {
        status = "Bukan Penerima";
    }

    data.push({
        nama: nama,
        umur: umur + " Tahun",
        gajiortu: "Rp. " + gaji,
        ipk: ipk,
        status: status
    });

    console.table(data);
}

Beasiswa();