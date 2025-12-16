/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function(arr, size) {
    let ans=[];
        let i=0;
        while(i<arr.length){
            let temp=arr.slice(i,i+size);
            ans.push(temp);
            i=i+size;
        }
    return ans;
};

