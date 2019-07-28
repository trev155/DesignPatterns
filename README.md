# DesignPatterns
Practice with Design Patterns

Examples adapted from the book "Head First Design Patterns"

## Notes
### Builder
Not in the Head First book, but still a good pattern to know. I came up with my own example for this one.

### Strategy
The strategy pattern example is almost the exact same as the example used in the book.

### Observer
For the observer pattern, I made up my own example, simulating a news feed, where the news feed publishes a list of 
articles every day, and subscribers can access these articles. Each subscriber decides how it wants to display this data.

I use the "push" method here as well as Java's built in observer classes. If I were to use the "pull" method,
I would not pass in the articles directly from the subject to the observers. 
Instead, I would provide public methods in the subject, so that observers can access these public methods
whenever they call update().

See the book's chapter for more details!

### Decorator
I follow the example from the book very closely.

### Factory
I implement the factory method here. Not doing the abstract factory.

Instead of Pizza, I will use Chocolate as the entity.
(Using chocolate is perhaps not as good as the Pizza example in the book but it is just practice after all...)

There are two concrete creator classes, the ChocolateStore classes.
The product is Chocolate, and there are different types of chocolate - milk, white, and dark.
Each of the chocolate types have slightly different ingredients, depending on which chocolate store it originates from.

### Singleton
The example is adapted from the book. Very simple example of using a Singleton pattern.

### Command
I follow the book's example quite closely.

There are a couple of entry points to run, so here they are in order:
1. Simple Remote Control
- run the SimpleRemoteControlTest

2. Remote Control
- run the RemoteControlLoader

3. Remote Control with Undo
- run the RemoteControlWithUndoLoader

4. Command pattern to keep track of state
- run the RemoteControlLoaderCeilingFan

5. Macro Commands
- run the RemoteControlLoaderMacro

### Adapter
I only have the basic Duck / Turkey example from the book here. I also don't cover the facade pattern here, but it's
a simple pattern so it probably does not need to be covered in here.


