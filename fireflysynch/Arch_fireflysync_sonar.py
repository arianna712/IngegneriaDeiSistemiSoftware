### conda install diagrams
from diagrams import Cluster, Diagram, Edge
from diagrams.custom import Custom
import os
os.environ['PATH'] += os.pathsep + 'C:/Program Files/Graphviz/bin/'

graphattr = {     #https://www.graphviz.org/doc/info/attrs.html
    'fontsize': '22',
}

nodeattr = {   
    'fontsize': '22',
    'bgcolor': 'lightyellow'
}

eventedgeattr = {
    'color': 'red',
    'style': 'dotted'
}
evattr = {
    'color': 'darkgreen',
    'style': 'dotted'
}
with Diagram('fireflysync_sonarArch', show=False, outformat='png', graph_attr=graphattr) as diag:
  with Cluster('env'):
     sys = Custom('','./qakicons/system.png')
### see https://renenyffenegger.ch/notes/tools/Graphviz/attributes/label/HTML-like/index
     with Cluster('ctxfireflysync', graph_attr=nodeattr):
          sonar=Custom('sonar','./qakicons/symActorWithobjSmall.png')
          orchestrator=Custom('orchestrator','./qakicons/symActorWithobjSmall.png')
          firefly=Custom('firefly','./qakicons/symActorDynamicWithobj.png')
     with Cluster('ctxgrid', graph_attr=nodeattr):
          griddisplay=Custom('griddisplay(ext)','./qakicons/externalQActor.png')
     sonar >> Edge( label='sonarinput', **eventedgeattr, decorate='true', fontcolor='red') >> sys
     sys >> Edge( label='sonarinput', **evattr, decorate='true', fontcolor='darkgreen') >> orchestrator
     orchestrator >> Edge( label='dosync', **eventedgeattr, decorate='true', fontcolor='red') >> sys
     orchestrator >> Edge( label='cancelsync', **eventedgeattr, decorate='true', fontcolor='red') >> sys
     sys >> Edge( label='dosync', **evattr, decorate='true', fontcolor='darkgreen') >> firefly
     sys >> Edge( label='cancelsync', **evattr, decorate='true', fontcolor='darkgreen') >> firefly
     firefly >> Edge(color='blue', style='solid',  decorate='true', label='<cellstatus &nbsp; >',  fontcolor='blue') >> griddisplay
diag
