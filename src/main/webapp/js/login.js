var loginx= new Vue({
	el:'#example-1',
	methods:{
		xden:function(event){
			var tion1= $("#x").text();
			var username=$("#stu_username_hide").val();
			var password=$("#stu_password_hide").val();
			dianj(tion1,username,password);
		}
	}
})
function dianj(tion1,username,password){
	new Vue({
		created:function(){
			fetch("http://127.0.0.1:8080/login?tion1="+tion1+"&username="+username+"&password="+password).then(response => response.text()).then(json => {
				if(json == "y"){
					location.href="mian.html";
				}else{
					
				}
			})
		}
	})
}