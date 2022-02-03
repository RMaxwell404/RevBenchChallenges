function boomerang(arr) {
	var booms = 0;
	for (let i = 0; i < (arr.length - 2); i++){
		if(arr[i] != arr[i+1] && arr[i] == arr[i+2]){
			booms++
		}
	}
	return booms
}

function loneones(arr){
	var lones;
	for (let i = 1; i < arr.length -1; i++ ){
		if(arr[i] == 1 && arr[i-1] != 1 && arr[i+1] != 1)
		lones++
	}
	return lones;
}


