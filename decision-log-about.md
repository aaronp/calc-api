
### What is this?

An Engineering/Architectural Decision Log helps track the information used to make key decisions in a project.

It allows project members to revisit decisions in the face of new information/experience and check past assumptions.

### Do we really need it?
Being able to succinctly track the driving force behind decisions allows us to:
 * socialise our reasoning / share knowledge
 * leverage the best of everyone's perspective/experience
 * know how to reverse/change/update our decisions

 Without it, new project members (or our future selves) won't be able to make as effective changes -- they won't know why certain things are done the way they are, and so they won't make as impactful changes as they could with confidence.

### How does it work?

The key things we need to track:
 * The problem: what issue are we trying to address?
 * Who is involved: who does this issue impact?
 * The criteria: what information should we use to rank our options?
 * The options: what could we try, and how does that weigh up against our criteria?
 * The solution: what did we go with, who decided it (e.g. who do we need to consult in future if it needs to be reworked), and are there any dates/milestones by which we should revisit the decision?

**NOTE:**
This need not take a lot of time. Less is more. What is the necessary/sufficient info required?

We should also try to number or name criteria, solutions, etc so that we can address them

## What does it look like?

The general template is:

### < decision number > < Decision Name >

#### == Description ==

What's the problem/issue/opportunity? 
What are we trying to solve?
Who will be impacted?


#### == Criteria ==

What will we use to compare one solution against another?
Cost? Time? Effort? Impact? Support? Learning Curve? Risk?

Tip: You may alread have some ideas for solutions in mind which you'd like to try.
Try to reverse engineer that thought. What is it about that which you like? Why?

### Options

List any options here with a short name or number.

What are the pros/cons? If these are too detailed, perhaps link to other documentation/pages/resources.

e.g.

#### Option 1: Fizz the Buzz

We should fizz the buzz.

Pros:

 * This option is recognised as an industry standard (see here and here).
 * ...

Cons:
 * Everyone uses it, but nobody likes it. You can hire people, but they won't be happy.
 * ...

### Evaluation

This is for a short-hand list of the above options and their weights.

Each column may have its own range:
 * Complexity: 0 to 10 from least to most, where 10 is most complex
 * Cost: The total dollar amount
 * Learning Curve: 0 to 10 from easiest to most steep (10 the hardest)

| Option        | Complexity | Cost | Learning Curve | ... |
| ------------- | ---------- | ---- | -------------- | --- |
| Fizz the Buzz | 3          | 7    | 3              | ... |
| Do Nothing    | 0          | 0    | 0              | ... |
| ...           | ...        | ...  | ...            | ... |

### Decision

Just mention:
 * Which of the above decisions did we go with
 * Who was involved in that decision
 * When 
 * And date or next steps by which time we'll revisit the decision

NOTE: Anbody should be able to review this and raise the issue with the relevant people listed
should new learning / situations arise