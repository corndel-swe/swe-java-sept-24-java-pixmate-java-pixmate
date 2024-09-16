# Contributing

Great work on the deep dive. Now let's make some art!

## Drawings

### Necklace

1. Run `node drawings/necklace.js` and behold the beauty!

1. Take a look at `necklace.js` to figure out what is going on.

1. Copy the code into a new `.js` file and hack around to make some different
   patterns. Have fun!

### Rectangle

1. Run `node drawings/rectangle.js` and marvel at the wonder!

1. Take a look a `rectangle.js` and hack around to see how it works.

1. If you make something interesting, save it in a new file!

To make a 2D shape, you are using something called a "nested loop" - that is a
loop inside a loop. The outer loop iterates through the rows, and the inner loop
iterates through each row itself.

Could you make `rectangle.js` into a function which accepts `width` and `height`
to make it more versatile?

### Triangle

Can you draw this?

```txt
*
**
***
****
*****
```

Can you make it a function with the number of rows as a paramter?

### Inverted triangle

How about this?

```txt
*****
****
***
**
*
```

### Triangle sandwich

And this?

```txt
*
**
***
****
*****
****
***
**
*
```

### Diagonal

These guys?

```txt
*
 *
  *
   *
    *
```

and

```txt
    *
   *
  *
 *
*
```

### Checkerboard

A bit trickier...

```txt
* * * * *
 * * * *
* * * * *
 * * * *
* * * * *
```

You'll need some conditional logic here.

### Keep going!

Draw whatever you like. Something useful. Something pretty. Get creative! Use
colour, pattern, functions, conditions... there are no rules.

## Animate

We've provided a function `animate(frames, interval)` which accepts an array of
strings. It will print each frame with `interval` seconds in-between.

### Loading

Have a look at `animations/loading.js` to see how `animate` can be used.

We use a loop to build up a string and push it into an array of `frames`. We
pass this array to `animate` with the desired interval.

Copy the code into a new file. Here are some things to try:

- make it into a function to adjust the length of the loading bar
- add some colour!
- add a message to each frame saying the current % completion

### More animations

Go ahead and make any more animations you like. Feel free to copy `animate.js`
and hack it to change the animation behaviour if you like.

Some ideas:

- make two arrows crash into eachother and explode `--> <--`

- make a loading spinner with the symbols `-`, `\`, `|`, `/`

- make a twinkling night sky using `Math.random()`

(Hint: to make a 2D animation, you can put `\n` into a string to render a line
break.)
