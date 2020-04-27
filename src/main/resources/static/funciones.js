function eliminar(id) {
    swal({
        title: "Estas seguro de que desea eliminar?",
        text: "si acepta se borraran permanentemente",
        icon: "warning",
        buttons: true,
        dangerMode: true,
    })
        .then((OK) => {
            if (OK) {
                $.ajax({
                    url: "/eliminar/"+id,success :function (res) {
                        console.log(res);
                    }
                });
                swal("poof! your imaginary file has  been  deleted!",{
                    icon: "success",
                }).then((ok)=>{
                    if (ok){
                        location.href="/listar";
                    }

                });
            } else {
                swal("Your imaginary file is safe!");
            }
        });
}