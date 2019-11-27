var theOldWay = "yameroooo!!"
function run() {
   let num = 0
   const constant = 10
 
   // you can change the value
   num += 1
   num += "" // int + str = str
   console.log(num)
   num += constant
   console.log(num) // 110
 
   try {
       constant = num // error?!
   } catch(e) {
       console.log("-- NOOO!! --")
   }
 
   // Declares theOldWay locally; declares theOldWay2 globally.
   var theOldWay = theOldWay2 = "yameteeee!!"
   console.log(theOldWay)
}
run() // run the function
 
// about the variable scope, see below
console.log("VARIABLE SCOPE")
console.log(theOldWay) // yamero vs yamete?
console.log(theOldWay2)
console.log(theOldWay == theOldWay2) // equality
console.log(theOldWay === theOldWay2) // strict equality. NANI???
// We are in strict mode, it would throw error
// In non-strict mode, like what we are doing right now
// theOldWay is the global one as expected -> yamero
// theOldWay2 is leaked outside of the function, though! -> no error, yamete
console.log(num, constants) // error??!! 
// Because they live inside the function only. We can’t refer them outside the function



